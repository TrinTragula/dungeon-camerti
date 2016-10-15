/*
 * Pixel Dungeon
 * Copyright (C) 2012-2015 Oleg Dolya
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package com.watabou.pixeldungeon.items.rings;

import com.watabou.pixeldungeon.Dungeon;
import com.watabou.pixeldungeon.actors.hero.Hero;

public class RingOfDetection extends Ring {

	{
		name = "LSD";
	}
	
	@Override
	public boolean doEquip( Hero hero ) {
		if (super.doEquip( hero )) {
			Dungeon.hero.search( false );
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	protected RingBuff buff( ) {
		return new Detection();
	}
	
	@Override
	public String desc() {
		return isKnown() ?
			"Riesci a vedere oltre le porte scarne della realta' fisica - " +
			"puoi vedere tutte le trappole ed i segreti! " +
			"Anche se sarai meno bravo a concentrarti a cercare." :
			super.desc();
	}
	
	public class Detection extends RingBuff {
	}
}
