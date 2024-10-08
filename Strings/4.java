class Solution{
    public String removeConsecutiveCharacter(String S){
        StringBuilder sb = new StringBuilder();
        sb.append(S.charAt(0));
        for(int i = 1; i < S.length(); i++){
            if(sb.charAt(sb.length() - 1) != S.charAt(i)){
                sb.append(S.charAt(i));
            }
        }
        return sb.toString();
    }
}
