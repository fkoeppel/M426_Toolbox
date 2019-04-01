package Toolbox;

/*
 * author:		Vorname Nachname
 * element:		XXX
 * date:		18.03.19
 * 
 */

public class Toolbox {
	public TextSuchen TextSuchen;
	public TextEditor TextEditor;
	public Promillewert Promillewert;
	public ElectricalResistance ElectricalResistance;
	public Density Density;
	public CurrencyConverter CurrencyConverter;
	public CircleCalc CircleCalc;
	public ImageConverter ImageConverter;
	public MetricUnit MetricUnit;
	public SurfaceCalc SurfaceCalc;
	public HashGenerator HashGenerator;
	public GewichtsmasseUmwandeln GewichtsmasseUmwandeln;
	public Round Round;
	public Time Time;
	
	public Toolbox() {
		this.TextSuchen = new TextSuchen();
		this.TextEditor = new TextEditor();
		this.Promillewert = new Promillewert();
		this.ElectricalResistance = new ElectricalResistance();
		this.Density = new Density();
		this.CurrencyConverter = new CurrencyConverter();
		this.CircleCalc = new CircleCalc();
		this.ImageConverter = new ImageConverter();
		this.MetricUnit = new MetricUnit();
		this.SurfaceCalc = new SurfaceCalc();
		this.HashGenerator = new HashGenerator();
		this.GewichtsmasseUmwandeln = new GewichtsmasseUmwandeln();
		this.Round = new Round();
		this.Time = new Time();
	}
}