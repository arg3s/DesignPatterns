/**
 * Created by Konrad on 2017-05-18.
 */
public class Building {
    private final Fundamentals fundamentals;
    private final Roof roof;
    private final Walls walls;
    private final Windows windows;


    //Konstruktor dla budynku
    public Building(Builder builder) {
        this.fundamentals = builder.fundamentals;
        this.walls = builder.walls;
        this.windows = builder.windows;
        this.roof = builder.roof;
    }

    public Fundamentals getFundamentals() {
        return fundamentals;
    }

    public Roof getRoof() {
        return roof;
    }

    public Walls getWalls() {
        return walls;
    }

    public Windows getWindows() {
        return windows;
    }

    @Override
    public String toString() {
        return "Building{" +
                "fundamentals=" + fundamentals +
                ", roof=" + roof +
                ", walls=" + walls +
                ", windows=" + windows +
                '}';
    }


    public static class Builder {
        private final Fundamentals fundamentals;
        private Roof roof;
        private Walls walls;
        private Windows windows;

        public Builder(Fundamentals fundamentals) {
            if (fundamentals == null) {
                throw new IllegalArgumentException("Building must have fundamentals!");
            }
            this.fundamentals = fundamentals;
        }

        public Building build() {
            return new Building(this);
        }

        public Builder withWalls(Walls walls) {
            this.walls = walls;
            return this;
        }

        public Builder withWindows(Windows windows) {
            this.windows = windows;
            return this;
        }

        public Builder withRoof(Roof roof) {
            this.roof = roof;
            return this;
        }


    }
}
