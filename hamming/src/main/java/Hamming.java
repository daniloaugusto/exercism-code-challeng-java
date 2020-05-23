public class Hamming {
    private int hammingDistance;

    public Hamming(String leftStrand, String rightStrand) {
        int leftStrandLength = leftStrand.length();
        int rightStrandLength = rightStrand.length();
        
        if (leftStrand.isEmpty() && !rightStrand.isEmpty()) {
            throw new IllegalArgumentException("left strand must not be empty.");
        }

        if (rightStrand.isEmpty() && !leftStrand.isEmpty()) {
            throw new IllegalArgumentException("right strand must not be empty.");
        }

        if (leftStrandLength != rightStrandLength) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length."); 
        }

        for (int i = 0; i < leftStrandLength; i++) {
            if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
                hammingDistance += 1;
            }
        }

    }

    public int getHammingDistance() {
        return hammingDistance;
    }
}
