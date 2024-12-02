class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        List<String> wordList = new ArrayList<>();
        StringBuilder currentWord = new StringBuilder();

        for(char c : sentence.toCharArray()){
            if(c!=' '){
                currentWord.append(c);
            } else{
                if(currentWord.length() > 0){
                    wordList.add(currentWord.toString());
                    currentWord.setLength(0);
                }
            }
        }
        if (currentWord.length() > 0) {
            wordList.add(currentWord.toString());
        }

        for(int wordIndex=0; wordIndex<wordList.size(); wordIndex++) {
            String word = wordList.get(wordIndex);
            if(word.length() >= searchWord.length()){
                boolean isMatch = true;

                for(int charIndex=0; charIndex<searchWord.length();charIndex++){
                    if(word.charAt(charIndex) != searchWord.charAt(charIndex)){
                        isMatch = false;
                        break;
                    }
                }
                if (isMatch) {
                    return wordIndex + 1; // Return 1-based index
                }
            }
        }
        return -1;
    }
}