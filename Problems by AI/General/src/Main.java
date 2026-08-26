void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print(" enter n1: ");
    int n1 = sc.nextInt(); // 5
    System.out.print(" enter n2: ");
    int n2 = sc.nextInt(); // 3

    n1 = n2 + n1; // n1 = 8
    n2 = n1 - n2; // n2 = 5
    n1 = n1 - n2; //

    System.out.println("n1: " + n1);
    System.out.println("n2: " + n2);
}