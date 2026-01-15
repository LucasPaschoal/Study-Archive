import model.entities.Reservations;
import model.exceptions.DomainException;

void main() {
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    try {
        System.out.println("Room number: ");
        int number = sc.nextInt();
        System.out.println("Check-in date (dd/mm/yyyy): ");
        Date chekIn = sdf.parse(sc.next());
        System.out.println("Check-out date (dd/mm/yyyy): ");
        Date chekOut = sdf.parse(sc.next());

        Reservations reservations = new Reservations(number, chekIn, chekOut);
        System.out.println("Reservation: "+reservations);

        System.out.println("\nEnter data update the reservation: ");
        System.out.println("Check-in date (dd/MM/yyyy): ");
        chekIn = sdf.parse(sc.next());
        System.out.println("Check-out date (dd/mm/yyyy): ");
        chekOut = sdf.parse(sc.next());

        reservations.updateDates(chekIn, chekOut);
        System.out.println("Reservation: "+reservations);
    }
    catch (ParseException e) {
        System.out.println("Invalid date format");
    }
    catch (DomainException e) {
        System.out.println("Error in reservation: "+ e.getMessage());
    }
    catch (RuntimeException e) {
        System.out.println("Unexpected error in reservation: "+ e.getMessage());
    }


    sc.close();
}
