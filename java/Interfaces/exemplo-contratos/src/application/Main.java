import entities.Contract;

void main() {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    System.out.println("Entre com os dados do Contrato: ");
    System.out.print("Numero: ");
    Integer number = sc.nextInt();
    System.out.println("Data (dd/MM/yyyy): ");
    LocalDate date = LocalDate.parse(sc.next(), fmt);
    System.out.println("Valor do Contrato: ");
    double totalValue = sc.nextDouble();

    Contract obj = new Contract(number, date, totalValue);

}
