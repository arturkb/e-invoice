/**
 * Copyright 2013 Artur Barczysnki http://www.arturkb.pl
 * 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 * 
 */
package pl.arturkb.EInvoice.UI;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Artur Barczynski
 *
 */
public class Breadcrumb {
	
	private List<BreadcrumbItem> elements;
	
	public Breadcrumb() {
		elements = new LinkedList<BreadcrumbItem>();
	}

	/**
	 * @return the elements
	 */
	public List<BreadcrumbItem> getElements() {
		return elements;
	}

	/**
	 * @param elements the elements to set
	 */
	public void setElements(List<BreadcrumbItem> elements) {
		this.elements = elements;
	}

}
