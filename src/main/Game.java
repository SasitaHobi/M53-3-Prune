package main;

import java.util.*;

public class Game {
    public Player player;
    public WorldMap worldMap;

    public void start() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nom du joueur : ");
        player = new Player(sc.nextLine());

        worldMap = new WorldMap(3, 3);
        worldMap.setPlayerLocation(1, 1); // Position initiale au centre

        CommandRegistry registry = new CommandRegistry();
        List<ICommand> cmds = new ArrayList<>();

        ICommand move = new CommandMove();
        ICommand map = new CommandMap();
        ICommand look = new CommandLook();
        ICommand help = new CommandHelp(cmds);

        cmds.add(move);
        cmds.add(map);
        cmds.add(look);
        cmds.add(help);

        for (ICommand cmd : cmds) registry.register(cmd);

        System.out.println("Le jeu commence. Tapez 'help' pour voir les commandes.");

        while (true) {
            System.out.print("> ");
            String input = sc.nextLine();
            if (input.equals("quit")) break;
            registry.execute(input, this);
        }
    }

    public static void main(String[] args) {
        new Game().start();
    }
}
