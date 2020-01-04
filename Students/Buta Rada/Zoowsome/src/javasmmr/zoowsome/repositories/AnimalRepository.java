package javasmmr.zoowsome.repositories;

import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Chameleon;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Crocodile;
import javasmmr.zoowsome.models.animals.Iguanids;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.animals.Owl;
import javasmmr.zoowsome.models.animals.Parrot;
import javasmmr.zoowsome.models.animals.Penguin;
import javasmmr.zoowsome.models.animals.SeaBird;
import javasmmr.zoowsome.models.animals.Spider;
import javasmmr.zoowsome.models.animals.StarFish;
import javasmmr.zoowsome.models.animals.Tiger;
import javasmmr.zoowsome.models.animals.Turtle;
import javasmmr.zoowsome.services.factories.Constants;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;

public class AnimalRepository extends EntityRepository<Animals> {

	private static final String XML_FILENAME = "Animals.xml";

	public AnimalRepository() {
		super(XML_FILENAME, Constants.XML_TAGS.ANIMAL);
	}

	public ArrayList<Animals> load() throws ParserConfigurationException, SAXException, IOException {
		ArrayList<Animals> animals = new ArrayList<Animals>();
		File fXmlFile = new File(XML_FILENAME);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();
		NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.ANIMAL);
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0)
						.getTextContent();
				switch (discriminant) {
				case Constants.Animals.Mammals.Cow:
					Animals cow = new Cow();
					cow.decodeFromXml(element);
					animals.add(cow);
					break;
				case Constants.Animals.Mammals.Tiger:
					Animals tiger = new Tiger();
					tiger.decodeFromXml(element);
					animals.add(tiger);
					break;
				case Constants.Animals.Mammals.Monkey:
					Animals monkey = new Monkey();
					monkey.decodeFromXml(element);
					animals.add(monkey);
					break;
				case Constants.Animals.Aquatics.Turtle:
					Animals turtle = new Turtle();
					turtle.decodeFromXml(element);
					animals.add(turtle);
					break;
				case Constants.Animals.Aquatics.StarFish:
					Animals starfish = new StarFish();
					starfish.decodeFromXml(element);
					animals.add(starfish);
					break;
				case Constants.Animals.Aquatics.SeaBird:
					Animals seabird = new SeaBird();
					seabird.decodeFromXml(element);
					animals.add(seabird);
					break;
				case Constants.Animals.Birds.Penguin:
					Animals pengu = new Penguin();
					pengu.decodeFromXml(element);
					animals.add(pengu);
					break;
				case Constants.Animals.Birds.Parrot:
					Animals par = new Parrot();
					par.decodeFromXml(element);
					animals.add(par);
					break;
				case Constants.Animals.Birds.Owl:
					Animals owl = new Owl();
					owl.decodeFromXml(element);
					animals.add(owl);
					break;
				case Constants.Animals.Reptiles.Iguanids:
					Animals iguanids = new Iguanids();
					iguanids.decodeFromXml(element);
					animals.add(iguanids);
					break;
				case Constants.Animals.Reptiles.Crocodile:
					Animals croco = new Crocodile();
					croco.decodeFromXml(element);
					animals.add(croco);
					break;
				case Constants.Animals.Reptiles.Chameleon:
					Animals chameleon = new Chameleon();
					chameleon.decodeFromXml(element);
					animals.add(chameleon);
					break;
				case Constants.Animals.Insects.Cockroach:
					Animals cockr = new Cockroach();
					cockr.decodeFromXml(element);
					animals.add(cockr);
					break;
				case Constants.Animals.Insects.Spider:
					Animals spid = new Spider();
					spid.decodeFromXml(element);
					;
					animals.add(spid);
					break;
				case Constants.Animals.Insects.Butterfly:
					Animals butterfly = new Butterfly();
					butterfly.decodeFromXml(element);
					animals.add(butterfly);
					break;
				default:
					break;
				}

			}
		}
		return animals;

	}

	@Override
	protected Animals getEntityFromXmlElement(Element element) {
		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		switch (discriminant) {
		case Constants.Animals.Mammals.Cow:
			Animals cow = new Cow();
			cow.decodeFromXml(element);
			return cow;

		case Constants.Animals.Mammals.Tiger:
			Animals tiger = new Tiger();
			tiger.decodeFromXml(element);
			return tiger;

		case Constants.Animals.Mammals.Monkey:
			Animals monkey = new Monkey();
			monkey.decodeFromXml(element);
			return monkey;

		case Constants.Animals.Aquatics.Turtle:
			Animals turtle = new Turtle();
			turtle.decodeFromXml(element);
			return turtle;

		case Constants.Animals.Aquatics.StarFish:
			Animals starfish = new StarFish();
			starfish.decodeFromXml(element);
			return starfish;

		case Constants.Animals.Aquatics.SeaBird:
			Animals seabird = new SeaBird();
			seabird.decodeFromXml(element);
			return seabird;

		case Constants.Animals.Birds.Penguin:
			Animals pengu = new Penguin();
			pengu.decodeFromXml(element);
			return pengu;

		case Constants.Animals.Birds.Parrot:
			Animals par = new Parrot();
			par.decodeFromXml(element);
			return par;
		case Constants.Animals.Birds.Owl:
			Animals owl = new Owl();
			owl.decodeFromXml(element);
			return owl;

		case Constants.Animals.Reptiles.Iguanids:
			Animals iguanids = new Iguanids();
			iguanids.decodeFromXml(element);
			return iguanids;

		case Constants.Animals.Reptiles.Crocodile:
			Animals croco = new Crocodile();
			croco.decodeFromXml(element);
			return croco;

		case Constants.Animals.Reptiles.Chameleon:
			Animals chameleon = new Chameleon();
			chameleon.decodeFromXml(element);
			return chameleon;

		case Constants.Animals.Insects.Cockroach:
			Animals cockr = new Cockroach();
			cockr.decodeFromXml(element);
			return cockr;

		case Constants.Animals.Insects.Spider:
			Animals spid = new Spider();
			spid.decodeFromXml(element);
			return spid;

		case Constants.Animals.Insects.Butterfly:
			Animals butterfly = new Butterfly();
			butterfly.decodeFromXml(element);
			return butterfly;

		default:
			break;
		}
		return null;
	}
}
