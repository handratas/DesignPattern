package com.handrata.headfirstdesignpattern.pattern.observer.weatherstation;

/**
 * - Both the Subjects and Observers use interfaces.
 * The Subject keeps track of objects implementing the Observer interface, while the Observers register with,
 * and get notified by, the Subject interface. As we've seen, this keeps things nice and loosely coupled.
 *
 * - The observer pattern uses composition to compose any number of Observers with their Subjects.
 * These relationships aren't set up by some kinds of inheritance hierarchy.
 * No, they are set up at runtime by composition!
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
