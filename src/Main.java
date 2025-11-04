//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


    //Linear Search
    int[] numbersForLinear = {3, 7, 12, 18, 21, 25, 29};

    for(int i = 0; i < numbersForLinear.length; i++)
    {
        if(numbersForLinear[i] == 21)
        {
            System.out.println(numbersForLinear[i]);
        }
    }

    //Binary Search

    int[] numbersForBinary = {7, 29, 21, 18, 3, 25, 12};
    //Sorting
    for(int i = 0; i < numbersForBinary.length; i++)
    {
        for (int j = 0; j < numbersForBinary.length; j++) {
            if (numbersForBinary[i] < numbersForBinary[j])
            {
                int temp = numbersForBinary[i];
                numbersForBinary[i] = numbersForBinary[j];
                numbersForBinary[j] = temp;
            }
        }
    }
    //Searching
    int midIndex = (numbersForBinary.length - 1) / 2;
    boolean flag = true;

    while(flag)
    {
        if (numbersForBinary[midIndex] == 21)
        {
            flag = false;
            System.out.println(numbersForBinary[midIndex] + " " + midIndex);
        }
        else if (numbersForBinary[midIndex] < 21)
        {
            midIndex = ((numbersForBinary.length - 1) + midIndex)/2;
        }
        else  if (numbersForBinary[midIndex] > 21)
        {
            midIndex = midIndex/2;
        }
    }

    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    if (number > 100) {
        System.out.println("Large");
    } else if (number < 10) {
        System.out.println("Small");
    }
    else {
        System.out.println("Medium");
    }


    int decimalNumber = 45;
    String binary = "";

    int n = decimalNumber;

    while (n > 0) {
        int remainder = n % 2;
        binary = remainder + binary;
        n = n / 2;
    }

    System.out.println(decimalNumber + " decimal = " + binary + " binary");
}
