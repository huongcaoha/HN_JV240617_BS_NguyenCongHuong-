package ra.presentation;

import ra.common.IMethod;

public class BookManagement {
    public static void main(String[] args) {
        while (true){
            System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┳━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┳━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
            System.out.println("|                                        |                                        |                                        |");
            System.out.println("|            1. Catalog management       |         2. Product management          |                3. Exit                 |");
            System.out.println("|                                        |                                        |                                        |");
            System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┻━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┻━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
            int choice = IMethod.getNumber("Enter your choice : ");
            switch (choice){
                case 1 : {
                    CatalogManagement.main(args);
                }
                case 2 : {
                    ProductManagement.main(args);
                    break;
                }
                case 3 : {
                    System.out.println("Goodbye !!!");
                    return;
                }
                default: {
                    System.err.println("Enter choice from 1 to 3 !");
                }
            }
        }
    }
}
