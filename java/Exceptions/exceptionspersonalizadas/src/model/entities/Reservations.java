package model.entities;

import model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservations {
    private Integer roomNumeber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservations(Integer roomNumeber, Date checkIn, Date checkOut) {
        if (checkIn.after(checkOut)) {
            throw new DomainException("Reservation date fos update must be after check-in date");
        }
        this.roomNumeber = roomNumeber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumeber() {
        return roomNumeber;
    }

    public void setRoomNumeber(Integer roomNumeber) {
        this.roomNumeber = roomNumeber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duration() {
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MICROSECONDS);
    }

    public void updateDates(Date checkIn, Date checkOut) {
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now))  {
            throw new DomainException("Reservation date fos update must be after ofr current date");
        }
        if (checkIn.after(checkOut)) {
            throw new DomainException("Reservation date fos update must be after check-in date");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Room " +
                roomNumeber +
                ", check-in: " +
                sdf.format(checkIn) +
                ", check-out: " +
                sdf.format(checkOut) +
                ", " +
                duration() + " nights";
    }

}
