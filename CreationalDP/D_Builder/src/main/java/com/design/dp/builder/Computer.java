package com.design.dp.builder;

public class Computer {
    //mandatory fields
    private String hardDisk;
    private String ram;
    private String displayDimension;

    //optional fields
    private String ssd;
    private boolean hasBluetooth;
    private boolean hasDolbyAudio;
    private boolean isUltraEdgeDisplay;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computer{");
        sb.append("hardDisk='").append(hardDisk).append('\'');
        sb.append(", ram='").append(ram).append('\'');
        sb.append(", displayDimension='").append(displayDimension).append('\'');
        sb.append(", ssd='").append(ssd).append('\'');
        sb.append(", hasBluetooth=").append(hasBluetooth);
        sb.append(", hasDolbyAudio=").append(hasDolbyAudio);
        sb.append(", isUltraEdgeDisplay=").append(isUltraEdgeDisplay);
        sb.append('}');
        return sb.toString();
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public String getRam() {
        return ram;
    }

    public String getDisplayDimension() {
        return displayDimension;
    }

    public String getSsd() {
        return ssd;
    }

    public boolean isHasBluetooth() {
        return hasBluetooth;
    }

    public boolean isHasDolbyAudio() {
        return hasDolbyAudio;
    }

    public boolean isUltraEdgeDisplay() {
        return isUltraEdgeDisplay;
    }

    private Computer(ComputerBuilder builder) {
        this.hardDisk=builder.hardDisk;
        this.ram=builder.ram;
        this.displayDimension=builder.displayDimension;
        this.hasDolbyAudio=builder.hasDolbyAudio;
        this.hasBluetooth=builder.hasBluetooth;
        this.ssd=builder.ssd;
        this.isUltraEdgeDisplay=builder.isUltraEdgeDisplay;
    }

    public static class ComputerBuilder{
        //mandatory fields
        private String hardDisk;
        private String ram;
        private String displayDimension;

        //optional fields
        private String ssd;
        private boolean hasBluetooth;
        private boolean hasDolbyAudio;
        private boolean isUltraEdgeDisplay;

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("ComputerBuilder{");
            sb.append("hardDisk='").append(hardDisk).append('\'');
            sb.append(", ram='").append(ram).append('\'');
            sb.append(", displayDimension='").append(displayDimension).append('\'');
            sb.append(", ssd='").append(ssd).append('\'');
            sb.append(", hasBluetooth=").append(hasBluetooth);
            sb.append(", hasDolbyAudio=").append(hasDolbyAudio);
            sb.append(", isUltraEdgeDisplay=").append(isUltraEdgeDisplay);
            sb.append('}');
            return sb.toString();
        }

        public ComputerBuilder(String hardDisk, String ram, String displayDimension) {
            this.hardDisk = hardDisk;
            this.ram = ram;
            this.displayDimension = displayDimension;
        }

        public ComputerBuilder setSsd(String ssd) {
            this.ssd = ssd;
            return this;
        }

        public ComputerBuilder setHasBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        public ComputerBuilder setHasDolbyAudio(boolean hasDolbyAudio) {
            this.hasDolbyAudio = hasDolbyAudio;
            return this;
        }

        public ComputerBuilder setUltraEdgeDisplay(boolean ultraEdgeDisplay) {
            isUltraEdgeDisplay = ultraEdgeDisplay;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
