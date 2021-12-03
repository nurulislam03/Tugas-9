//Overriding
class Manusia {
    public void Berpakaian(){
        System.out.println("Semua manusia berpakaian");
    }
    
    public void BertahanHidup(){
        System.out.println("Semua manusia makan untuk bertahan hidup");
    }
}

class Pria extends Manusia {
    
    @Override
    public void Berpakaian(){
        System.out.println("Pria memakai kemeja pria dan celana panjang");
    }
}

class Wanita extends Manusia {
    @Override
    public void Berpakaian(){
        System.out.println("Wanita memakai kerudung, kemeja wanita, dan rok");
    }
}

public class Main {
    public static void main(String[] args) {
        Pria Fathur = new Pria();
        Wanita Nurul = new Wanita();
        
        Fathur.Berpakaian();
        Fathur.BertahanHidup();
        
        Nurul.Berpakaian();
        Nurul.BertahanHidup();
    }
}
