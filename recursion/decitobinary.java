static int find(int decimal_number) {
    if (decimal_number == 0) 
        return 0; 
    else
        return (decimal_number % 2 + 10 * find(decimal_number / 2));
}
