public class Teste {
        private String nome;
        private String artista;
        private  int id;
        private static int proximoId=0;

        Teste(String nome, String artista) {
            this.nome = nome;
            this.artista = artista;
            id=proximoId;
            proximoId++;
        }

        public String getNome() {
            return nome;
        }

        public String getArtista(){
            return artista;
        }

        public int getId(){
            return id;
        }

        @Override
        public String toString(){
            return "\nMúsica: " + nome + " Artista: " + artista + " ID: " + id + "\n";
        }

    }
