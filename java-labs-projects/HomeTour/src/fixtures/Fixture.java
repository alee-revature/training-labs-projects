/*
 * This abstract class will be used as a base for
 * anything that can be looked at or interacted with
 * 
 * This class will define at least the following properties
 * String name: a short name/title for the fixture
 * String shortDescription: a 1-sentence long description of a fixture, used to briefly mention the fixture
 * String longDescription: a paragraph-long description of the thing,
 * displayed when the player investigates the fixture thoroughly
 * (looks at it, or enters a room)
 */
package fixtures;

public abstract class Fixture {

	String name;
	
	String shortDesc;
	
	String longDesc;
}
