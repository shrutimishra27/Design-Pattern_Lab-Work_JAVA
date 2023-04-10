package iteratorDP;
public class MusicContainer implements iContainer{
    private String instruments[] = {"Piano","Guitar","Violin","Drum"};

    @Override
    public iIterator getIterator() {
        return new MusicIterator();
    }

    private class MusicIterator implements iIterator{
        private int index;

        @Override
        public boolean hasnext() {
            if (index < instruments.length){
                return true;
            }else {
                return false;
            }
        }

        @Override
        public Object next() {
            if (this.hasnext()){
                return instruments[index++];
            }else {
                return null;
            }
        }
    }
}
