# Xtext sample
This repository contains the files I used during the introduction session to Xtext at the first Hackcamp Wolfsburg. Import the four projects into your Eclipse/Xtext distribution and run a new Eclipse instance with right click on the	 de.schakko.xtext.AutomotiveBusDsl project > Run as > Eclipse application.

Inside the new Eclipse application instance create a new Java project and put a file called sample.bus inside the "src" folder.
Put the following content in the sample.bus file:

	Busses CAN, Ethernet
	Messages { 
		Error has fields {
			char msg is required
			int checksum
		}
	}
	Components {
		Motorsteuergeraet sends messages {
			of type Error("A") over CAN as broadcast
		}
	}

	Vehicles {
		Golf has components {
			Motorsteuergeraet
		}
	}

A folder src-gen will be generated which contains the transformed model.

# Presentation
The "presentation" I showed can be found online at http://schakko.github.io/hackcamp-xtext-automotivebus or open the index.html in the browser. The "presentation" I hacked together ten minutes before I started my talk so don't expect too much of it.
