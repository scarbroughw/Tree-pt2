


/**
            USING NETBEANS?  ADD PACKAGE STATEMENT
*/




/**
    Programmed by   Stephen Brower
    Date Written:    3/20/2012
    Date Modified    10/23/2012 - removed package info
                                  renamed to lab 8
                     3/27/2013 - renamed to Lab 6/7
                     7/23/2013 - renamed to Lab 9
                     4/2/2014  - renamed to lab 8
                     4/6/2015  - renamed to lab 10
                               - changed print to inOrderPrint
                     3/30/2016 - added NetBeans and Lab 6 comments

    Note - The Tree is the Tree<E> you create for Lab 6
*/

public class TestTreePart1WithCar
{
    public static void main(String[] args)
    {
        Tree<Car> myTree = new Tree<Car>();

        Car carToAdd;

        System.out.println("Before adds, Tree: (Size == "+myTree.size()+")");

        carToAdd = new Car(2013,"Nissan GT-R");
        myTree.add(carToAdd);
        System.out.println("After adding <"+carToAdd+"> Tree: (Size == "+myTree.size()+")");

        carToAdd = new Car(2013,"BMW 328i Sport");
        myTree.add(carToAdd);
        System.out.println("After adding <"+carToAdd+"> Tree: (Size == "+myTree.size()+")");

        carToAdd = new Car(2013,"Subaru BRZ");
        myTree.add(carToAdd);
        System.out.println("After adding <"+carToAdd+"> Tree: (Size == "+myTree.size()+")");

        carToAdd = new Car(2013,"Honda Civic");
        myTree.add(carToAdd);
        System.out.println("After adding <"+carToAdd+"> Tree: (Size == "+myTree.size()+")");

        carToAdd = new Car(2013,"Honda Accord");
        myTree.add(carToAdd);
        System.out.println("After adding <"+carToAdd+"> Tree: (Size == "+myTree.size()+")");

        carToAdd = new Car(2013,"Zoom Zoom");
        myTree.add(carToAdd);
        System.out.println("After adding <"+carToAdd+"> Tree: (Size == "+myTree.size()+")");

        carToAdd = new Car(2013,"Acura");
        myTree.add(carToAdd);
        System.out.println("After adding <"+carToAdd+"> Tree: (Size == "+myTree.size()+")");


        System.out.println("\nTree after adds (Size == "+myTree.size()+")");
        myTree.inOrderPrint(); // that method will call root.inOrderPrint();
    }
}

/* Output is:
Before adds, Tree: (Size == 0)
After adding <[Car 2013 Nissan GT-R]> Tree: (Size == 1)
After adding <[Car 2013 BMW 328i Sport]> Tree: (Size == 2)
After adding <[Car 2013 Subaru BRZ]> Tree: (Size == 3)
After adding <[Car 2013 Honda Civic]> Tree: (Size == 4)
After adding <[Car 2013 Honda Accord]> Tree: (Size == 5)
After adding <[Car 2013 Zoom Zoom]> Tree: (Size == 6)
After adding <[Car 2013 Acura]> Tree: (Size == 7)

Tree after adds (Size == 7)
[Car 2013 Acura]
[Car 2013 BMW 328i Sport]
[Car 2013 Honda Accord]
[Car 2013 Honda Civic]
[Car 2013 Nissan GT-R]
[Car 2013 Subaru BRZ]
[Car 2013 Zoom Zoom]
*/