// PANAGRAM CHECK OF THE SENTENCE
// A SENTENCE CALLED PANAGRAM IF IT CONTAINS ALL ENGLISH ALPHABET 
// LEET CODE QUESTION https://leetcode.com/problems/check-if-the-sentence-is-pangram/

class Solution {
    public boolean checkIfPangram(String sentence) {
        int count = 0;
        String change_sentence = sentence.toLowerCase();
        for(int i=97;i<=122;i++){
            for(int j=0;j<change_sentence.length();j++){
                if((int)change_sentence.charAt(j) == i){
                    count++;
                    break;
                }
            }
        }
            if(count == 26){
                return true;
            }
            else{
                return false;
            }
        }
    }

// SECOND SOLUTION OF PANAGRAM

/*class Solution {
    public boolean checkIfPangram(String sentence) {
        for(char ch = 'a';ch<='z';ch++){
            if(sentence.indexOf(ch)== -1){
                return false;
            }
        }
        return true;
        }
    }*/

