public class FriendPairing {
    public static int pairing(int n){
        if(n==1 || n==2) return n;
        else
            return pairing(n-1) + pairing(n-2) * n-1;
    }
    
public static void main(String [] args){
    int totalPair= pairing(1);
    System.out.println(totalPair);
}
}
