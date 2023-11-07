public class forLoops {
    public static void main(String[] args) {
        System.out.print("\\");
        for (int z = 15; z >= 1; z--) {
            System.out.print(" : ");
            if (z == 9) {
                System.out.print("/");
                System.out.println();
                System.out.print("   \\");
                for (z = 8; z >= 1; z--) {
                    System.out.print(" : ");
                    if (z == 4) {
                        System.out.print("/");
                        System.out.println();
                        System.out.print("      \\");
                        for (z = 3; z >= 1; z--) {
                            System.out.print(" : ");
                        }
                        System.out.print("/");
                        System.out.println();
                        System.out.print("         | : |");

                    }
                }

            }

        }
        System.out.println();
        System.out.print("      /");
        for (int i = 1; i <= 3; i++) {
            System.out.print(" : ");
            if (i == 3) {
                System.out.print("\\");
                System.out.println();
                System.out.print("   /");
                for (i = 3; i <= 7; i++) {
                    System.out.print(" : ");
                    if (i == 7) {
                        System.out.print("\\");
                        System.out.println();
                        System.out.print("/");
                        for (i = 9; i <= 15; i++) {
                            System.out.print(" : ");
                        }
                        System.out.print("\\");
                    }
                }


            }
        }
    }
}
