package Wzorce;

public class Room {

    private int roomNo;
    private int bedsCnt;
    private boolean isAvailable;
    private boolean isClean;
    private boolean hasBathroom;
    private double roomSpace;

    public static class Builder
    {    // przed wzorcem Builder
        private int roomNo;
        private int bedsCnt;
        private boolean isAvailable;
        private boolean isClean;
        private boolean hasBathroom;
        private double roomSpace;

        // po wprowadzeniu wzorca Builder
        public Builder(){}  // wstawione dla kompatybilności, bo... (App.java linia 13 i 14)
        public Builder(int roomNo, int bedsCnt)
        {
            this.roomNo = roomNo;
            this.bedsCnt = bedsCnt;

        }
        public Builder roomNo(int roomNo){
            this.roomNo = roomNo;
            return this;
        }
        public Builder bedsCnt(int bedsCnt){
            this.bedsCnt = bedsCnt;
            return this;
        }
        public Builder isAvailable(boolean isAvailable){
            this.isAvailable = isAvailable;
            return this;
        }
        public Builder isClean(boolean isClean){
            this.isClean = isClean;
            return this;
        }
        public Builder hasBathroom(boolean hasBathroom){
            this.hasBathroom = hasBathroom;
            return this;
        }
        public Builder roomSpace(double roomSpace){
            this.roomSpace = roomSpace;
            return this;
        }
        public Room build(){
            return new Room(this);
        }

    }
    // po wprowadzeniu wzorca Builder
    private Room (Builder bob)
    {
        roomNo = bob.roomNo;
        bedsCnt = bob.bedsCnt;
        isAvailable = bob.isAvailable;
        isClean = bob.isClean;
        hasBathroom = bob.hasBathroom;
        roomSpace = bob.roomSpace;
    }

    /*/ przed wzorcem Builder
    public Room (int roomNo, int bedsCnt, boolean isAvailable, boolean isClean, boolean hasBathroom, float roomSpace)
    {
        this.roomNo = roomNo;
        this.bedsCnt = bedsCnt;
        this.isAvailable = isAvailable;
        this.isClean = isClean;
        this.hasBathroom = hasBathroom;
        this.roomSpace = roomSpace;
    }*/

    @Override
    public String toString() {
        String str = "RoomNo: "+this.roomNo;
                str+= " BedsCnt: "+this.bedsCnt;
                str+= " Available: "+this.isAvailable;
                str+= " Clean: "+this.isClean;
                str+= " Bathroom: "+this.hasBathroom;
                str+= " Space: "+this.roomSpace;
        return str;
    }
}
