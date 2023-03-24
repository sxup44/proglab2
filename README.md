### Based on the base class, write your classes for the specified types of Pokémon. Each type of Pokémon must have one or two types and standard basic characteristics:Pokemon

- Health Glasses (HP)
- attack
- defense
- special attack
- special defense
- speed

Classes of Pokémon must be inherited according to the Pokémon evolution chain. Based on the base classes, and implement their own classes for the specified types of attacks.PhysicalMoveSpecialMoveStatusMove

The attack must be of the standard type, power, and accuracy. Standard attack effects must be implemented. Assign each type of Pokémon attack according to the variant. The Pokémon level is selected as the minimum required for all implemented attacks.

Using the battle simulation class, create 2 Pokémon commands (each Pokémon must have a name) and start the fight.Battle

The base classes and the battle simulator are in the [jar archive](https://se.ifmo.ru/documents/10180/660917/Pokemon.jar/a7ce60af-6ee6-47d0-a95e-e5ed9a697bd2) (updated 9.10.2018, bug fixed with the addition of attacks and encoding). Documentation in javadoc format - [here](https://se.ifmo.ru/~tony/doc/).

Information about Pokémon, evolution chains, and attacks can be found on http://poke-universe.ru, http://pokemondb.net, http://veekun.com/dex/pokemon

### Comments
The purpose of the work: on a simple example, to understand the basic concepts of OOP and learn how to use them in programs.

What to do (brief description)

1. Read the documentation, paying particular attention to the classes and . If you continue to perform the lab work, read the documentation a few more times.Pokemon Move

2. Download the Pokemon.jar file. It will need to be used both to compile and to run the program. You don't need to unpack it! You need to learn how to connect external jar files to your program.

3. Write a minimally working program and see how it works.

Battle b = new Battle();

Pokemon p1 = new Pokemon("Чужой", 1);

Pokemon p2 = new Pokemon("Хищник", 1);

b.addAlly(p1);

b.addFoe(p2);

b.go();</sub>

4. Create one of the Pokémon classes for your variation. The class must inherit from the base class. In the constructor, you will need to specify the types of Pokémon and its basic characteristics. After that, try adding a Pokémon to the battle.Pokemon

5. Create one of the attack classes for your variant (it is best to start with a physical or special attack). A class must inherit from a class or . In the constructor, you will need to specify the type of attack, its strength and accuracy. After that, add a Pokémon attack and test its effect in the battle. Be sure to override the method to display the desired message.PhysicalMove SpecialMovedescribe

6. If the attack action is different from the standard one, for example, the Pokémon does not miss, or the attacking Pokémon is also damaged, then in the attack class you need to further override the corresponding methods (see documentation). When implementing attacks that change the status of the Pokémon (heirs), you will most likely have to deal with the class. It allows you to change the state of a Pokémon or a modifier of its basic characteristics for one or more moves.StatusMoveEffect
Finish all the necessary attacks and all Pokémon, distribute Pokémon into commands, start a battle.

*Variant can be found in [se.ifmo.ru](https://se.ifmo.ru/)*

*My variant is **215621***
