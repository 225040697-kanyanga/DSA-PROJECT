import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentQueue queue = new StudentQueue(10);
        StudentLinkedList list = new StudentLinkedList();
        int choose =0;
        int[] servedTimes = new int[100];
         int servedCount = 0;
        
        do {
            System.out.println("  CAMPUS SERVICE CENTRE");
            System.out.println("  ======================");
            System.out.println("  1. Add student to waiting queue ");
            System.out.println("  2. Serve next student ");
            System.out.println("  3. Display waiting students ");
            System.out.println("  4. Add student service record");
            System.out.println("  5. Display student service records ");
            System.out.println("  6. Search for student record");
            System.out.println("  7. Remove student record ");
            System.out.println("  8. Display daily statistics ");
            System.out.println("  9. Sort service times");
            System.out.println("  10. Run sorting experiment");
            System.out.println("  11. Exit");
            
            System.out.println("  Select option: ");
            choose = input.nextInt();
            
            switch(choose ){
                
                case 1:
                    System.out.print("Enter student number: ");
                    int number = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter student name: ");
                    String name = input.nextLine();
                    System.out.print("Enter service type: ");
                    String service = input.nextLine();
                    System.out.print("Enter service time: ");
                    int time = input.nextInt();
                    
                    Student student = new Student(number, name, service, time);
                    queue.enqueue(student);
                    
     


     
                        

                    
                    break;
                    
                    case 2:
                    student = queue.dequeue();
                    if (student != null) {
                      System.out.println("Student being served:");
                      student.display();
                      if (servedCount < servedTimes.length) {
                       servedTimes[servedCount] = student.serviceTime;
                         servedCount++;
                       }
                    }
                       break;    
                    
                    
                    case 3:
                    queue.displayQueue();
                    break;
                    
                    case 4:
                         System.out.print("Enter student number: ");
                         
                         number = input.nextInt();
                         input.nextLine();

                         System.out.print("Enter student name: ");
                         
                         name = input.nextLine();

                         System.out.print("Enter service type: ");
                         
                         service = input.nextLine();

                         System.out.print("Enter service time: ");
                         
                         time = input.nextInt();
  
                         
                         student = new Student(number, name, service, time);

                         list.insertAtEnd(student);
                    
                    break;
                    
                    case 5:
                    list.displayStudents();
                    break;
                    
                    case 6:
                    System.out.print("Enter student number: ");
                    
                     number = input.nextInt();
                     Student found = list.searchStudent(number);
                     if (found != null) {
                     System.out.println("Student found:");
                     found.display();
                     } else {
                      System.out.println("Student not found.");
                     }
                    break;
                    
                    case 7:
                        System.out.print("Enter student number: ");
                        
                        number = input.nextInt();
                        
                        list.deleteStudent(number);

                   
                    break;
                    
                    case 8:
                    
                      int[] actualServiceTimes = new int[servedCount];
                      for (int i = 0; i < servedCount; i++) {
                         actualServiceTimes[i] = servedTimes[i];
                     }
                        DailyStatisticsArray.calculate(actualServiceTimes);
                         break;

                    case 9:
                    int[] times = {17, 5, 23, 8, 14, 3, 11, 20, 6, 9};

                    System.out.println("\nChoose a sorting method:");
                    System.out.println("1. Selection Sort");
                    System.out.println("2. Insertion Sort");
                    System.out.print("Choose: ");

                    int sortChoice = input.nextInt();

                    if (sortChoice == 1) {

                    SelectionSort.sort(times);

                    } else if (sortChoice == 2) {

                    InsertionSort.sort(times);

                    } else {

                    System.out.println("Invalid choice.");
                    
                    }
                    break;
                    
                    case 10:
                     SortingExperiment.runExperiment();
                    break;
                    
                    case 11:
                    System.out.println("Exit ");
                    break;
                    
                    
                    default:
                        System.out.println("invalid option:Try again");
            }
            }
            while(choose !=11);
            input.close();
            
            
            
                    
          
          }
        }
    

