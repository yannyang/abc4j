// Copyright 2006-2008 Lionel Gueganton
// This file is part of abc4j.
//
// abc4j is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// abc4j is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with abc4j.  If not, see <http://www.gnu.org/licenses/>.
package abc.notation;

/**
 * An instruction is a {@link abc.instructions.Xcommand} or a
 * User defined symbol.
 * 
 * Instructions can be added in the "header" of a Tune to apply
 * to the whole tune, until they encounter a "local" instruction
 * in the {@link abc.notation.Music} in the middle of notes.
 */
public interface Instruction extends Cloneable {

}
