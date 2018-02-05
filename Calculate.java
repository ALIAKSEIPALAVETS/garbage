// таблица умножения 

 class Solution {
    public static void main(String[] args) {
        int a, b = 1;
        while (b <= 10) {
            for (a = 1; a <= 10; a++)
            System.out.print(a * b + " ");
            b++; 
			System.out.println();
        }
}
} 