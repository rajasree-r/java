package kavitha.PracticeJava;

public class PrintNumber {
    public static void main(String[] args) {
        if (args.length > 0) {
            long number = 0;
            char firstChar = args[0].charAt(0);
            char secondChar = args[0].charAt(1);
            switch (firstChar) {
                case 'o':
                    number = 1L;
                    break;
                case 't':
                    if (secondChar == 'w')
                        number = 2L;
                    else if (secondChar == 'h')
                        number = 3L;
                    else
                        number = 10L;
                    break;
                case 'f':
                    if(secondChar=='o')
                        number=4L;
                    else
                        number=5L;
                    break;
                case 's':
                    if(secondChar=='i')
                        number=6L;
                    else
                        number=7L;
                    break;
                case 'e' :
                    number=8L;
                    break;
                case 'n':
                    number=9L;
                    break;
            }
            System.out.println("The number is " + number);
        }
    }
}



