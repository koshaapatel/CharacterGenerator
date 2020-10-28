/* (c) Copyright 2020 and following years, Yann-Gaël Guéhéneuc,
 * Concordia University.
 * 
 * Use and copying of this software and preparation of derivative works
 * based upon this software are permitted. Any copy of this software or
 * of any derivative work must include the above copyright notice of
 * the author, this paragraph and the one after it.
 * 
 * This software is made available AS IS, and THE AUTHOR DISCLAIMS
 * ALL WARRANTIES, EXPRESS OR IMPLIED, INCLUDING WITHOUT LIMITATION THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE, AND NOT WITHSTANDING ANY OTHER PROVISION CONTAINED HEREIN,
 * ANY LIABILITY FOR DAMAGES RESULTING FROM THE SOFTWARE OR ITS USE IS
 * EXPRESSLY DISCLAIMED, WHETHER ARISING IN CONTRACT, TORT (INCLUDING
 * NEGLIGENCE) OR STRICT LIABILITY, EVEN IF THE AUTHOR IS ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGES.
 * 
 * All Rights Reserved.
 */
package ca.concordia.soen6461.characterclasses;

import ca.concordia.soen6461.abilityclasses.ICharisma;
import ca.concordia.soen6461.abilityclasses.IConstitution;
import ca.concordia.soen6461.abilityclasses.IDexterity;
import ca.concordia.soen6461.abilityclasses.IIntelligence;
import ca.concordia.soen6461.abilityclasses.IStrength;
import ca.concordia.soen6461.abilityclasses.IWisdom;

public interface IDruid extends ICharacter {
	public abstract  void setScore();
	public abstract void getScore();
	public abstract void setStrength(IStrength strength, String strengthString);
	public abstract void setDexterity(IDexterity dexterity, String dexterityString);
	public abstract void setConstitution(IConstitution constitution, String constitutionString);
	public abstract void setIntelligence(IIntelligence intelligence, String intelligenceString);
	public abstract void setWisdom(IWisdom wisdom, String wisdomString);
	public abstract void setCharisma(ICharisma charisma, String charismaString);

}
