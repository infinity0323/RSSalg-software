/** 	
 * Name: VoterIF.java
 * 
 * Purpose: Interface for the classes that aggregate the predictions of multiple classifiers in order to produce a final prediction.
 * 
 * Author: Jelena Slivka <slivkaje AT uns DOT ac DOT rs>
 * 
 * Copyright: (c) 2016 Jelena Slivka <slivkaje AT uns DOT ac DOT rs>
 * 
 * This file is a part of RSSalg software, a flexible, highly configurable tool for experimenting 
 * with co-training based techniques. RSSalg Software encompasses the implementation of 
 * co-training and RSSalg, a co-training based technique that can be applied to single-view 
 * datasets published in the paper: 
 * 
 * Slivka, J., Kovacevic, A. and Konjovic, Z., 2013. 
 * Combining Co-Training with Ensemble Learning for Application on Single-View Natural 
 * Language Datasets. Acta Polytechnica Hungarica, 10(2).
 *   
 * RSSalg software is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * RSSalg software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 **/
package algorithms.RSSalg.voter;

import algorithms.RSSalg.resultStatistic.Label;
import algorithms.RSSalg.resultStatistic.Votes;

/**
 * Interface for the classes that aggregate the predictions of multiple classifiers in order to produce a final prediction
 *
 */
public interface VoterIF {
	
	/**
	 * Aggregates the predictions of multiple classifiers in order to assign a final label
	 * @param predictions predictions of multiple classifiers
	 * @return the assigned label
	 */
	public Label vote(Votes predictions);

	/**
	 * Returns the name of the algorithm
	 * @return name of the voter algorithm
	 */
	public String getName();
}
