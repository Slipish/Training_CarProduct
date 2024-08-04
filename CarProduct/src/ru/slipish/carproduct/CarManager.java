package ru.slipish.carproduct;
import java.util.Scanner;
import java.util.ArrayList;

public class CarManager {

    private static Scanner input;
    
    private static void printMenu() {
        System.out.println("\n" + "Меню:");
        System.out.println("1. Добавить машину");
        System.out.println("2. Удалить машину");
        System.out.println("3. Изменить машину");
        System.out.println("4. Просмотреть все машины");
        System.out.println("5. Удалить все машины");
		System.out.print("Введите номер пункта меню: ");
    }   
    
    private static void printMenuCar() {
        System.out.println("\n" + "Какой параметр требуется изменить?");
        System.out.println("1. name");
        System.out.println("2. yearOFProduction");
        System.out.println("3. price");
        System.out.println("4. weigth");
        System.out.println("5. color");
		System.out.print("Введите номер пункта меню: ");
    }   

 
	public static void main(String[] args) {
				
		ArrayList<Car> carList = new ArrayList<>();
		carList.add(0, new Car("Toyota prius", 2008, 15000, 1200, "GREEN"));
		carList.add(1, new Car("Renault Talismans", 2000, 9700, 1600, "WHITE"));
		carList.add(2, new Car("Toyota prius", 2008, 15000, 1200, "GREEN"));
		carList.add(3, new Car("Renault Talismans", 2000, 9700, 1600, "WHITE"));	
		printMenu();
		
		while (true) {
			int keyMenu = 0;
			input = new Scanner (System.in);
			if (input.hasNextInt()) {
				keyMenu = input.nextInt();
			}
			switch (keyMenu) {
			
        case 1:
       	
         	System.out.print("name");
        	input = new Scanner(System.in);
        	String name = input.nextLine();
        	
        	System.out.print("yearOFProduction");
        	input = new Scanner(System.in);
        	while (input.hasNextInt() == false) {
        		input = new Scanner(System.in);
        		System.out.print("требуется ввести yearOFProduction числом:");
			}
        	int yearOFProduction = input.nextInt();
			
        	System.out.print("price");
        	input = new Scanner(System.in);
        	while (input.hasNextInt() == false) {
        		input = new Scanner(System.in);
        		System.out.print("требуется ввести price числом:");
        	}
        	int price = input.nextInt();
        	
			System.out.print("weigth");
			input = new Scanner(System.in);
			while (input.hasNextInt() == false) {
				input = new Scanner(System.in);
				System.out.print("требуется ввести weigth числом:");
			}
			int weigth = input.nextInt();
			
			System.out.print("color");
			input = new Scanner(System.in);
			String color = input.nextLine();
			
			carList.add(new Car(name, yearOFProduction, price, weigth, color));
			System.out.println("Машина добавлена:" + carList.get(carList.size()-1)+"\n");
    		break;
    		
        case 2:
        	
        	System.out.print("Укажите номер строки для удаления:");
        	int numberDelete = 0;
        	input = new Scanner(System.in);
        	while (input.hasNextInt() == false) {
        		input = new Scanner(System.in);
        		System.out.print("Укажите номер строки для удаления числом:");
			}
        	numberDelete = input.nextInt();
        	carList.remove(numberDelete-1);
        	break;
        	
        case 3:
        	
        	if (carList.size() > 0) {
	        	System.out.println("\n" + "Перечень автомобилей:");
	        	for (int numberInCarlist = 0; numberInCarlist < carList.size(); numberInCarlist++) {
	    			input = new Scanner(System.in);
	    			System.out.print((numberInCarlist+1) + ") ");
	    			System.out.println(carList.get(numberInCarlist));
	    			}
	        	} else {
	        		System.out.println("Перечень автомобилей пуст!");
	            	break;
	        		}
        	System.out.println("Как автомобиль хотите изменить? укажите номер:");
        	
        	int numberCar = 0;
			input = new Scanner (System.in);
			if (input.hasNextInt()) {
				numberCar = input.nextInt();
			}
        	
        	printMenuCar();
        	
        	while (true) {
    			int keyMenuCar = 0;
    			input = new Scanner (System.in);
    			if (input.hasNextInt()) {
    				keyMenuCar = input.nextInt();
    			}
    			switch (keyMenuCar) {
    			
            case 1:
            	
           	   	System.out.print("name");
            	input = new Scanner(System.in);
            	name = input.nextLine();
            	carList.get(numberCar-1).name = name;
            	break;
            	
            case 2:
            	
            	System.out.print("yearOFProduction");
            	input = new Scanner(System.in);
            	while (input.hasNextInt() == false) {
            		input = new Scanner(System.in);
            		System.out.print("требуется ввести yearOFProduction числом:");
    			}
            	yearOFProduction = input.nextInt();
            	carList.get(numberCar-1).yearOFProduction = yearOFProduction;
            	break;
            	
            case 3:
            	
            	System.out.print("price");
            	input = new Scanner(System.in);
            	while (input.hasNextInt() == false) {
            		input = new Scanner(System.in);
            		System.out.print("требуется ввести price числом:");
            	}
            	price = input.nextInt();
            	carList.get(numberCar-1).price = price;
            	break;
            	
            case 4:
            	
    			System.out.print("weigth");
    			input = new Scanner(System.in);
    			while (input.hasNextInt() == false) {
    				input = new Scanner(System.in);
    				System.out.print("требуется ввести weigth числом:");
    			}
    			weigth = input.nextInt();
    			carList.get(numberCar-1).weigth = weigth;
        		break;
        		
            case 5:
            	
            	System.out.print("color");
    			input = new Scanner(System.in);
    			color = input.nextLine();
    			carList.get(numberCar-1).color = color;
            	break;

            default:
                System.out.println("Вы ввели неверное значение меню...\n");
         }
        	break;
        	}
        	
        case 4:
        	
        	if (carList.size() > 0) {
	        	System.out.println("\n" + "Перечень автомобилей:");
	        	for (int numberInCarlist = 0; numberInCarlist < carList.size(); numberInCarlist++) {
	    			input = new Scanner(System.in);
	    			System.out.print((numberInCarlist+1) + ") ");
	    			System.out.println(carList.get(numberInCarlist));
	    			}
	        	} else {
	        		System.out.println("Перечень автомобилей пуст!");
	        		}
    		break;
    		
        case 5:
        	
        	carList.clear();
        	System.out.println("Все автомобили удалены");
        	break;
        	
        default:
        	
            System.out.println("Вы ввели неверное значение меню...\n");
     }
			
			printMenu();
	}
	}
    }
