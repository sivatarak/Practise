public class TowerBarrel {
    public static void main(String[] args) {
        int n = 1, m = 4;
        matchWinner(n, m);
        System.out.println(matchWinner(n, m));
    }

    public static int matchWinner(int n, int m) {
        int p1 = 1, p2 = 2;
        int p1movement = 0;
        int p2movement = 0;
        int v=m-1;
        if (n == 1) {
            for (int i = v; i > 0; i--) {
              if (m%i==0){
                  v=i;
                  p1movement++;
              }
              else{
                  continue;
              }
              for(int j=v-1;j>0;j--){
                  if(m%j==0){
                      i=j;
                      p2movement++;
                      break;
                  }
              }
            }

        }
        if (p2movement >= p1movement) {
            return 2;
        } else {
            return 1;
        }

    }
}
