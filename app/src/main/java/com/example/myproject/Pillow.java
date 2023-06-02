package com.example.myproject;
/*
 *@author Joseph Pickett
 *version 0.5
 */

public class Pillow
{
    /*
     * texture of pillow
     */
    private String texture;
    /*
     * size of pillow
     */
    private String size;
    /*
     * quality level of pillows
     */
    private int qualityLevel;
    //
    private int cost;
    /*
     * if the pillow is pretty
     */
    private boolean isPretty;
    /*
     * if the pillow is comfortbale
     */
    private boolean isComfortable;
    /*
     * Pillow ID number
     */
    private int pillowID;
    /*
     * number of pillows
     */
    private static int numPillows;
    /*
     * default constructor for pillow
     * Precondition: none
     * Postcondition: creates pillow object with no texture, no size, 1 amount, is not pretty, and is comfortable
     */
    public Pillow()
    {
        this.pillowID = numPillows;
        this.texture = "worn";
        this.size = "skinny";
        this.qualityLevel = 1;
        this.cost = 0;
        this.isPretty = false;
        this.isComfortable = true;

        numPillows++;
    }
    /*
     * default constructor for pillow
     * Precondition: texture and size are non-empty strings
     * Postcondition: creates a pillow object with texture, size, 3 quality, is pretty, is comfortable
     * @param texture; texture of pillow
     * @param size; size of pillow
     */

    public Pillow(String texture, String size)
    {
        this.pillowID = numPillows;
        this.texture = texture;
        this.size = size;
        this.qualityLevel = 1;
        this.cost = 0;
        this.isPretty = true;
        this.isComfortable = false;

        numPillows++;
    }

    public Pillow(boolean isPretty, boolean isComfortable)
    {
        this.texture = "soft";
        this.size = "small";
        this.qualityLevel = 1;
        this.cost = 0;
        this.isPretty = isPretty;
        this.isComfortable = isComfortable;
        this.pillowID = numPillows;
        numPillows++;
    }
    /*
     * default constructor for pillow
     * Precondition: texture and size are nonempty strings, amount is a non negative integer, isPretty and isComfortable are booleans
     * Postcondition: creates object for pillow class for given texture, given size, given amount, if the pillow is pretty, if the pillow is comfortable
     *@param texture texture of pillow
     *@param size size of pillow
     *@param quality of pillows
     *@param isPretty true if pillow is pretty
     *@param isComfortable true if pillow is comfortable
     */

    public Pillow(String texture, String size, int qualityLevel, boolean isPretty, boolean isComfortable)
    {
        this.pillowID = numPillows;
        this.texture = texture;
        this.size = size;
        this.qualityLevel = qualityLevel;
        this.cost = cost;
        this.isPretty = isPretty;
        this.isComfortable = isComfortable;

        numPillows++;
    }
    /*
     * gets texture of pillow
     * Precondition: none
     * Postcondition: returns texture of pillow
     * @return of texture
     */
    public String getTexture()
    {
        return texture;
    }
    /*
     *
     */
    public int getPillowID()
    {
        return pillowID;
    }
    public static int getTotalNumPillows()
    {
        return numPillows;
    }
    /*
     * gets texture of pillow
     * Precondition: none
     * Postcondition: returns size of pillow
     *@return of size
     */
    public String getSize()
    {
        return size;
    }
    /*
     * gets texture of pillow
     * Precondition: none
     * Postcondition: returns quality of pillows
     * @return amount of pillows
     */
    public int getQualityLevel()
    {
        return qualityLevel;
    }

    public int getCost()
    {
        return cost;
    }
    /*
     * gets texture of pillow
     * Precondition: none
     * Postcondition: returns if pillow is pretty
     * @return if pillow is pretty
     */
    public boolean getIsPretty()
    {
        return isPretty;
    }
    /*
     * gets texture of pillow
     * Precondition: none
     * Postcondition: returns of pillow is comfortable
     * @return if pillow is comfortable
     */
    public boolean getIsComfortable()
    {
        return isComfortable;
    }
    /*
     * toString method for Pillow class
     * Precondition: none
     * Postcondition: returns pillow texture, size, quality of pillows, if the pillow is pretty, if the pillow is comfortable
     */
    public String toString()
    {
        return  "texture: " + texture +
                "\nPillowID: " + pillowID +
                "\nsize: " + size +
                "\nqualityLevel: " + qualityLevel + "\ncost: " +
                "\nisPretty: " + isPretty +
                "\nisComfortable: " + isComfortable;
    }
    /*
     * Sets the texture of pillows
     * Precondition: texture is a nonempty string
     * Postcondition: texture of pillow is set
     * @param newTexture new texture of pillow
     */
    public void setTexture(String newTexture)
    {
        texture = newTexture;
    }
    /*
     * Sets whether or not
     * Precondition: size is a nonempty string
     * Postcondition: size of pillow is set
     * @param newSize new size of pillow
     */
    public void setSize(String newSize)
    {
        size = newSize;
    }
    /*
     * Sets whether or not
     * Precondition: amount is a nonempty int
     * Postcondition: quality level
     * @param newAmount new amount of pillows
     */
    public void setQualityLevel(int newQualityLevel)
    {
        qualityLevel = newQualityLevel;
    }
    /*
     * Sets whether or not
     * Precondition: newIsPretty is nonempty boolean
     * Postcondition: isPretty is true or false
     * @param newIsPretty true or else
     */
    public void setCost(int newCost)
    {
        cost = newCost;
    }

    public void setisPretty(boolean newIsPretty)
    {
        isPretty = newIsPretty;
    }
    /*
     * Sets whether or not
     * Precondition: newIsComfortable is nonempty boolean
     * Postcondition: isPretty is true or false
     * @param newIsComfortable true or false
     */
    public void setIsComfortable(boolean newIsComfortable)
    {
        isComfortable = newIsComfortable;
    }
    /*
     *
     */
    public boolean equals(Pillow anotherPillow)
    {
        boolean result = false; //declare result
        if(this.texture.equals(anotherPillow.getTexture())  &&
                this.size        == anotherPillow.getSize()      &&
                this.qualityLevel      == anotherPillow.getQualityLevel()
        )
        {
            result = true;
        }
        return result;
    }























}


