 public class Earth {
        public static void main(String[] args) {
            double radiusKm = 6378;
            double kmToMilesFactor = 0.621371;
            double pi = 3.141592653589793;
            double volumeKm3 = (4.0 / 3.0) * pi * (radiusKm * radiusKm * radiusKm);
            double volumeMiles3 = volumeKm3 * (kmToMilesFactor * kmToMilesFactor * kmToMilesFactor);
            System.out.printf("The volume of Earth in cubic kilometers is %.2f and cubic miles is %.2f\n", volumeKm3, volumeMiles3);
        }
    }