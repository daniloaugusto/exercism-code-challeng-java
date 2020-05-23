class IsogramChecker {

    boolean isIsogram(String phrase) {
        int phraseLength = phrase.length();
        String lowerCasePhrase = phrase.toLowerCase();

        char letter;
        String intermediatePhrase;
        for (int i = 0; i < phraseLength - 1; i++) {
            letter = lowerCasePhrase.charAt(i);
            intermediatePhrase = lowerCasePhrase.substring(i+1, phraseLength);
            if (intermediatePhrase.indexOf(letter) != -1 && letter != ' ' && letter != '-') {
                return false;
            }
        }
        return true;
    }

}
