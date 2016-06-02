import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Point;
import java.util.List;

/**
 * This is just a subclass for all objects in the world. You can add every method you want here but you better don't delete or change the already existing methods.
 */
public abstract class Player extends Actor
{
    protected double exactX;
    protected double exactY;
    protected double velX;
    protected double velY;
    
    /**
     * Set the players location if possible.
     * 
     * @param x
     *      The new x location of the actor.
     * 
     * @param y
     *      The new y location of the actor.
     */
    public void setLocation(int x, int y) {
        if (ScrollingWorld.WORLD_WIDTH != 0) {
            if (getDistanceToScrollingActor('x') - getWorld().getTotalXMovement() > ScrollingWorld.WORLD_WIDTH/2) {
                x = (int) (getStartingPoint().getX() + ScrollingWorld.WORLD_WIDTH/2);
            }
            else if (getDistanceToScrollingActor('x') - getWorld().getTotalXMovement() < -ScrollingWorld.WORLD_WIDTH/2) {
                x = (int) (getStartingPoint().getX() - ScrollingWorld.WORLD_WIDTH/2);
            }
        }
        if (ScrollingWorld.WORLD_HEIGHT != 0) {
            if(getDistanceToScrollingActor('y') - getWorld().getTotalYMovement() > ScrollingWorld.WORLD_HEIGHT/2) {
                y = (int) (getStartingPoint().getY() + ScrollingWorld.WORLD_HEIGHT/2);
            }
            else if(getDistanceToScrollingActor('y') - getWorld().getTotalYMovement() < -ScrollingWorld.WORLD_HEIGHT/2) {
                y = (int) (getStartingPoint().getY() - ScrollingWorld.WORLD_HEIGHT/2);
            }
        }
        exactX = x;
        exactY = y;
        super.setLocation(x, y);
    }
    /**
     * Set the players location if possible.
     * 
     * @param x
     *      The new x location of the actor.
     * 
     * @param y
     *      The new y location of the actor.
     */
    public void setLocation(double x, double y) {
        if (ScrollingWorld.WORLD_WIDTH != 0) {
            if (getDistanceToScrollingActor('x') - getWorld().getTotalXMovement() > ScrollingWorld.WORLD_WIDTH/2) {
                x = getStartingPoint().getX() + ScrollingWorld.WORLD_WIDTH/2;
            }
            else if (getDistanceToScrollingActor('x') - getWorld().getTotalXMovement() < -ScrollingWorld.WORLD_WIDTH/2) {
                x = getStartingPoint().getX() - ScrollingWorld.WORLD_WIDTH/2;
            }
        }
        if (ScrollingWorld.WORLD_HEIGHT != 0) {
            if(getDistanceToScrollingActor('y') - getWorld().getTotalYMovement() > ScrollingWorld.WORLD_HEIGHT/2) {
                y = getStartingPoint().getY() + ScrollingWorld.WORLD_HEIGHT/2;
            }
            else if(getDistanceToScrollingActor('y') - getWorld().getTotalYMovement() < -ScrollingWorld.WORLD_HEIGHT/2) {
                y = getStartingPoint().getY() - ScrollingWorld.WORLD_HEIGHT/2;
            }
        }
        exactX = x;
        exactY = y;
        super.setLocation((int) x, (int) y);
    }
    
    /**
     * Get the distance to the ScrollingActor.
     * 
     * @return 
     *      The distance between this object and the ScrollingActor.
     */
    public double getDistanceToScrollingActor() {
        List<ScrollingActor> actors = getWorld().getObjects(ScrollingActor.class);
        if (actors != null && !actors.isEmpty()) {
            ScrollingActor actor = null;
            for (ScrollingActor scrollingActor : actors) {
                if (scrollingActor.isScrollingCenter()) {
                    actor = scrollingActor;
                }
            }
            if (actor == null) {
                System.err.println("No scrollingActor in the world.");
                return 0;
            }
            return Math.hypot(getExactX() - actor.getExactX(), getExactY() - actor.getExactY());
        }
        return 0;
    }
    /**
     * Get one component of the distance to the ScrollingActor.
     * 
     * @param component
     *      You can choose which component you want. It has to be eighter 'x' or 'y'.
     * 
     * @return 
     *      The component of the distance between the both objects.
     */
    public double getDistanceToScrollingActor(char component) throws IllegalArgumentException {
        if (component == 'x') {
            List<ScrollingActor> actors = getWorld().getObjects(ScrollingActor.class);
            if (actors != null && !actors.isEmpty()) {
                ScrollingActor actor = null;
                for (ScrollingActor scrollingActor : actors) {
                    if (scrollingActor.isScrollingCenter()) {
                        actor = scrollingActor;
                    }
                }
                if (actor == null) {
                    System.err.println("No scrollingActor in the world.");
                    return 0;
                }
                return getExactX() - actor.getExactX();
            }
        }
        else if (component == 'y') {
            List<ScrollingActor> actors = getWorld().getObjects(ScrollingActor.class);
            if (actors != null && !actors.isEmpty()) {
                ScrollingActor actor = null;
                for (ScrollingActor scrollingActor : actors) {
                    if (scrollingActor.isScrollingCenter()) {
                        actor = scrollingActor;
                    }
                }
                if (actor == null) {
                    System.err.println("No scrollingActor in the world.");
                    return 0;
                }
                return getExactY() - actor.getExactY();
            }
        }
        else {
            throw new IllegalArgumentException("component (" + component + ") must be either 'x' or 'y'");
        }
        return 0;
    }
    
    /**
     * Get the location of the starting point (the world coordinates (0|0)).
     * 
     * @return
     *      The starting point of the scrolling world.
     */
    public java.awt.Point getStartingPoint() {
        List<ScrollingActor> actors = getWorld().getObjects(ScrollingActor.class);
        if (actors != null && !actors.isEmpty()) {
            ScrollingActor actor = null;
            for (ScrollingActor scrollingActor : actors) {
                if (scrollingActor.isScrollingCenter()) {
                    actor = scrollingActor;
                }
            }
            if (actor == null) {
                System.err.println("No scrollingActor in the world.");
                return null;
            }
            int x = actor.getX() + getWorld().getTotalXMovement();
            int y = actor.getY() + getWorld().getTotalYMovement();
            return new Point(x, y);
        }
        return null;
    }
    
    /**
     * Get the players exact x location.
     * 
     * @return
     *      The players x location as a double value.
     */
    public double getExactX(){
        return exactX;
    }
    /**
     * Get the players exact y location.
     * 
     * @return
     *      The players y location as a double value.
     */
    public double getExactY(){
        return exactY;
    }
    
    /**
     * Get the players exact x location in the scrolling world.
     * 
     * @return
     *      The players x location related to the startingpoint of the scrolling world.
     */
    public double getScrollingX() {
        return getDistanceToScrollingActor('x') - getWorld().getTotalXMovement();
    }
    /**
     * Get the players exact y location in the scrolling world.
     * 
     * @return
     *      The players y location related to the startingpoint of the scrolling world.
     */
    public double getScrollingY() {
        return getDistanceToScrollingActor('y') - getWorld().getTotalYMovement();
    }
    
    /**
     * Get the current world casted to ScrollingWorld.
     */
    public ScrollingWorld getWorld() {
        return ((ScrollingWorld) super.getWorld());
    }
}