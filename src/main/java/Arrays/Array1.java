package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Array1 {
    private List<Integer> vetor = new ArrayList<>();

    public void AdicionarItem(int num){
        this.vetor.add(num);
    }

    public List getVetor() {
        return vetor;
    }
}
