import java.time.LocalDateTime;

public class carRental {
    private LocalDateTime start;
    private LocalDateTime finish;
    public vehicle vehicle;
    public invoice invoice;

    public carRental(LocalDateTime finish, vehicle vehicle) {
        this.finish = finish;
        this.vehicle = vehicle;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(vehicle vehicle) {
        this.vehicle = vehicle;
    }
}