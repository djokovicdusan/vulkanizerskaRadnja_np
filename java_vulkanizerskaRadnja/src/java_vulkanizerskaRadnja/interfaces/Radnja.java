package java_vulkanizerskaRadnja.interfaces;

import java.util.List;
import java_vulkanizerskaRadnja.models.AutoGuma;

public interface Radnja {
	void dodajGumu(AutoGuma a);

	List<AutoGuma> pronadjiGumu(String markaModel);

	List<AutoGuma> vratiSveGume();
}