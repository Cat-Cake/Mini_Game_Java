import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("\n .:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:. \n");
        Scanner input = new Scanner(System.in);
//        System.out.println("...................................',,;:clloooddddooooollcc::;,,'...................................\n" +
//                "..............................',;cldxxkkkkkkkkkxxxxxxxxddddddoollc:;,'..............................\n" +
//                "..........................',:ldxkOOOOOOOOkkkkkkkkxxxxxxxxddddddooooolc:;,'..........................\n" +
//                ".......................',coxOO00OOOOOOOOOOkkkkkkkkxxxxxxxxddddddooooolllc:;,'.......................\n" +
//                ".....................,:okO0000000OOOOOOOOOOkkxdoolllllloddddddddooooollllllcc;,'....................\n" +
//                "..................';lxO00000000000OOOOOOOkxdlccccccccc:::loddddddooooollllllllc:,'..................\n" +
//                "................';lk00000000000000000OOOxlc:ccclooooolllc::cldddddooooollllllllcc:,'................\n" +
//                "...............,lk00K0000000000000000OOdc;:::cloddxxxxddol:;;codddooooooolllllllccc:,'..............\n" +
//                ".............'cx0KKKKKK00000000000000Od:;;::clodxxkkkkkxdoc:,;codddoooooolllllllcccc:;'.............\n" +
//                "............,oOKKKKKKKKKKKK0000000000kc,;;:ccloddxxkOOOkxdl:;,;coddooooooollllllccccc::,'...........\n" +
//                "..........':x0KKKKKKKKKKKKK0000000000x:,;;:::::::cloxkkxoc;;,,,:odddoooooollllllcccccc::,'..........\n" +
//                ".........'ckKKKKKKKKKKKKKKKK000000000x:,;;;;;::;,;;codo:,,;,,',codddoooooolllllllccccc:::;'.........\n" +
//                "........'ckKKKKKKKKKKKKKKKKKK0000000Oxc,;;,,'',;;;;codl;,,,''',lodddoooooolllllllccccc::::;'........\n" +
//                ".......':kKKKKKKKKKKKKKKKKKK00000000xc:;;::ccccllllodxoc:;,,'';coddooooooolllllllccccc::::;,'.......\n" +
//                ".......;xKKKKKKKKKKKKKKKKKKK00000000xl:;;:codxxxoooodxdlclllc:;codoooooooollllllccccc:::::;;,.......\n" +
//                "......,o0KKKKKKKKKKKKKKKKKKK00000000kdl;;;coxkkxollooddlcoddl::lddoooooooollllllcccccc::::;;;'......\n" +
//                "......cOKKKKKKKKKKKKKKKKKKK0000000000kl,',;cldddl:;;;;;,;looc;:odooooooooollllllcccccc::::;;;,'.....\n" +
//                ".....,d0KKKKKKKKKKKKKKKKKK00000000000Oo;',,;:ccccccccc:::ccc;,cddddoooooolllllllcccccc::::;;;;'.....\n" +
//                ".....:kKKKKKKKKKKKKKKKKKKK00000000000Okl,,,,;;;;;;::cc:;,,,,,;ldddddooooolllllllccccc:::::;;;;,'....\n" +
//                "....'lOKKKKKKKKKKKKKKKKKK000000000OOOOOo'.',,,;;;:ccool:,,,''cddddddooooollllllcccccc::::::;;;,'....\n" +
//                "....,o0KKKKKKKKKKKKKKKKK000000OO0OOOOOd,...',,;;;;;;;;;,,,'':oddddddoooolllllllcccccc::::::;;;;'....\n" +
//                "....,d0KKKKKKKKKKKKKKKK000000OOOOOOOOkc......',;;::::;;;,'.,lddddddooooollllllccccccc:::::;;;;;'....\n" +
//                "....,d0KK0KKK0KKKK0000000000OOOOOOOOOk:.''....',,;;;;;;,'..,lddddddoooollllllcccccccc:::::;;;;;'....\n" +
//                "....,d0000000000000000000000OOOOOOOOOxccc;'.. ............'cc:coooooooollllllccccccc::::::;;;;;'....\n" +
//                "....'lO00000000000000000000OOOOOOOOkd;:dl,','..         .,oOo'..',;:cccllllllccccccc::::::;;;;;'....\n" +
//                "....'ck0000000000000000000OOOOOkxoc;'.cOd;',;;,'.......';o0Kx,.   .....'',;::ccccccc::::::;;;;,'....\n" +
//                ".....;d0000000000000OO00OOOkxl:,'.....oKKd;,;:::::::::::lOXXk;.     .........'',;::::::::::;;;,.....\n" +
//                ".....'lO0000000000OOOOkxdl:,.........'dKNXx:;:::::c::cclkXNXk:....................';:::::;;;;;'.....\n" +
//                "......;dOOOOOOOOOOkdl:,'..............oKNNXkoccclllllloxOOkkkc.....................'::::::;;;,......\n" +
//                "......'ckOOOOOOOko;...................oKXNNX0doooddoodddooood:......................;:::::;;,'......\n" +
//                ".......,lkOOOOOOd,....................ckxodkOOkxxddxkOOO0KXXKl...................  .;::::;;;'.......\n" +
//                "........,okOOOOko'....................:xkkxdxkkOOkkO00KXXXXX0l..................   .,::::;;,........\n" +
//                ".........;okOkkkl'.................. .;OXXXXXXKKKKKKXXXXXXXX0c................     .';::;;,.........\n" +
//                "..........,lkkkkl.....................'dKXXXXXXXXNNNNXXXXXXXO:..............        .,;;;,..........\n" +
//                "...........,cxkx:......................l0XXXXXXXXNNNNXXXXXXXO:...........           .';;'...........\n" +
//                "............':od;......................;OXXXXXXXXNNNNXXXXXXKk;..........             .''............\n" +
//                "..............,;.......................'dKXXXXXXXXNNNXXXKKKKx,..........             ...............\n" +
//                "........................................c0KXXXKKKXXNXXKKKKK0o..........            .................\n" +
//                "........................................,dKXKKKKKXXXXXKKKKKOc.........           ...................\n" +
//                ".........................................cOKKKKKKKXXXXKKKKKk;........         ......................\n" +
//                ".........................................'d0KKKKKKXXXXK00K0o'.......        ........................\n" +
//                "..........................................;k0KKK0KKXXXK000Oc.......      ...........................\n" +
//                "...........................................cO00000KKXKK000d,.....   ................................\n" +
//                "...........................................'oO00000KKKK00Ol.........................................\n" +
//                "............................................,cooodddddollc,.........................................");
        System.out.println("Entrer un exercice \n" +
                "1 - Pair \n" +
                "2 - Calculatrice \n" +
                "3 - Echiquier \n" +
                "4 - Afficher le prénom \n" +
                "5 - Table de multiplication \n" +
                "6 - Somme \n" +
                "7 - Bandit Manchot \n" +
                "Autre nombre - Quitter");
        int userChoose = input.nextInt();

        if (userChoose == 1) {
            NumberPair a = new NumberPair();
            NumberPair.pairexo();
        } else if (userChoose == 2) {
            Culculatrice a = new Culculatrice();
            Culculatrice.main(args);

        } else if (userChoose == 3) {
            Echiquier a = new Echiquier();
            Echiquier.main(args);

        } else if (userChoose == 4) {
            ShowName a = new ShowName();
            ShowName.main(args);

        } else if (userChoose == 5) {
            ShowtableMult a = new ShowtableMult();
            ShowtableMult.main(args);

        } else if (userChoose == 6) {
            Som a = new Som();
            Som.main(args);

        } else if (userChoose == 7) {
            BanditManchot a = new BanditManchot();
            BanditManchot.main(args);

        }else {
            System.out.println("Vous quittez l'exercice");
            return;
        }

    }
}