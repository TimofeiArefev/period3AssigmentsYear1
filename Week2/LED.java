public class LED {
    private int red;
    private int green;
    private int blue;
    private int dimmer;



    public LED(int red, int green, int blue, int dimmer) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.dimmer = dimmer;
    }


	public boolean setColor(String colorName) {
		if (colorName == "Red") {
			this.red = 255;
			this.green = 0;
			this.blue = 0;
			return true;
		} else if (colorName == "Green") {
			this.red = 0;
			this.green = 255;
			this.blue = 0;
			return true;
		} else if (colorName == "Blue") {
			this.red = 0;
			this.green = 0;
			this.blue = 255;
			return true;
		} else if (colorName == "Purple") {
			this.red = 255;
			this.green = 0;
			this.blue = 255;
			return true;
		} else if (colorName == "Orange") {
			this.red = 255;
			this.green = 165;
			this.blue = 0;
			return true;
		} else if (colorName == "Sun") {
			this.red = 201;
			this.green = 141;
			this.blue = 38;
			return true;
		} else {
			return false;
		}
	}
	
	public String getColorName() {
		if (this.red == 255 && this.green == 0 && this.blue == 0) {
			return "Red";
		} else if (this.red == 0 && this.green == 255 && this.blue == 0) {
			return "Green";
		} else if (this.red == 0 && this.green == 0 && this.blue == 255) {
			return "Blue";
		} else if (this.red == 255 && this.green == 0 && this.blue == 255) {
			return "Purple";
		} else if (this.red == 255 && this.green == 165 && this.blue == 0) {
			return "Orange";
		} else if (this.red == 201 && this.green == 141 && this.blue == 38) {
			return "Sun";
		} else {
			return "Unknown";
		}
	}

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public int getDimmer() {
        return dimmer;
    }

    public void setDimmer(int dimmer) {
        this.dimmer = dimmer;
    }


}