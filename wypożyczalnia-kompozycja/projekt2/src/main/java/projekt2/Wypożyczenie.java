package projekt2;

import java.util.Date;
import java.util.UUID;

    public class Wypożyczenie {
        private long borrowData; //przepraszam za zmienne w róznych językach, ale już mi brakowało pomysłów
        private UUID IDproduktu;
        private UUID IDuzytkownika;


        public long getBorrowData()
        {
            return borrowData;
        }

        public UUID getIDproduktu()
        {
            return IDproduktu;
        }

        public UUID getIDuzytkownika()
        {
            return IDuzytkownika;
        }

        public void setborrowData(long borrowData){ this.borrowData = borrowData; }
        public void setIDproduktu(UUID IDproduktu){ this.IDproduktu = IDproduktu; }
        public void setIDuzytkownika(UUID IDuzytkownika){ this.IDuzytkownika = IDuzytkownika; }
    }

