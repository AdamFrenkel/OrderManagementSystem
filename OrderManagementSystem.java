package edu.yu.cs.intro.orderManagement;
import java.util.Set;
import java.util.Map;
/**
* Takes orders, manages the warehouse as well as service providers
*/

public class OrderManagementSystem {
private Set<Product> productSet;
private int productStockLevel;
private Set<ServiceProvider> serviceProviderSet;
private Warehouse warehouseObject;
private Set<Service> setOfServicesProvidedByTheServiceProviders;
private Map<Service, ServiceProvider>  mapOfServicesToTheListOfServiceProviders;


 /**
 * Creates a new Warehouse instance and calls the other constructor
 *
 * @param products
 * @param defaultProductStockLevel
 * @param serviceProviders
 */
 public OrderManagementSystem(Set<Product> products, int defaultProductStockLevel,
Set<ServiceProvider> serviceProviders) {
 	this.productSet = products;
 	this.productStockLevel = defaultProductStockLevel;
 	this.serviceProviderSet = serviceProviders;



 }



 
 /**
 * 1) populate the warehouse with the products.
 * 2) retrieve set of services provided by the ServiceProviders, to save it as the set of
services the business can provide
 * 3) create map of services to the List of service providers
 *
 * @param products - set of products to populate the warehouse with
 * @param defaultProductStockLevel - the default number of products to stock for any product
 * @param serviceProviders - set of service providers and the services they provide, to
make up the services arm of the business
 * @param warehouse - the warehouse that we will store our products in
 */
 public OrderManagementSystem(Set<Product> products, int defaultProductStockLevel,
Set<ServiceProvider> serviceProviders, Warehouse warehouse) {
	//initialize the variables       //not sue exactly what I'm doing at this step
 	this.productSet = products;
 	this.productStockLevel = defaultProductStockLevel;
 	this.serviceProviderSet = serviceProviders;
 	this.warehouseObject = warehouse;

 	//1) populate the warehouse with the products.
 	for(Product currentProduct : this.productset){
 		warehouseObject.addNewProductToWarehouse(currentProduct, productStockLevel);
 	}

 	//2) retrieve set of services provided by the ServiceProviders, to save it as the set of
	//services the business can provide
	for(ServiceProvider currentServiceProvider : serviceProviderSet){
		this.setOfServicesProvidedByTheServiceProviders.addAll(currentServiceProvider.getServices());
	}

	//3) create map of services to the List of service providers







 }
 

 
//  /**
//  * Accept an order:
//  * 1) See if we have ServiceProviders for all Services in the order. If not, reject the order.
//  * 2) See if the warehouse can fulfill the order for Items. If so, place the product orders
// with the warehouse and handle the service orders inside this class
//  * 4) Mark the order as completed
//  * 5) Update busy status of serviced providers...
//  */
//  public void placeOrder(Order order) {}



//  /**
//  * Validate that all the services being ordered can be provided. Make sure to check how many
// instances of a given service are being requested in the order, and see if we have enough providers
// for them.
//  * @param services the set of services which are being ordered inside the order
//  * @param order the order whose services we are validating
//  * @return itemNumber of a requested service that we either do not have provider for at all, or
// for which we do not have an available provider. Return 0 if all services are valid.
//  */
//  protected int validateServices(Collection<Service> services, Order order) {}


 
//  /**
//  * validate that the requested quantity of products can be fulfilled
//  * @param products being ordered in this order
//  * @param order the order whose products we are validating
//  * @return itemNumber of product which is either not in the catalog or which we have
// insufficient quantity of. Return 0 if we can fulfill.
//  */
//  protected int validateProducts(Collection<Product> products, Order order) {}



//  /**
//  * Adds new Products to the set of products that the warehouse can ship/fulfill
//  * @param products the products to add to the warehouse
//  * @return set of products that were actually added (don't include any products that were
// already in the warehouse before this was called!)
//  */
//  protected Set<Product> addNewProducts(Collection<Product> products) {}
 


//  /**
//  * Adds an additional ServiceProvider to the system. Update all relevant data about which
// Services are offered and which ServiceProviders provide which services
//  * @param provider the provider to add
//  */
//  protected void addServiceProvider(ServiceProvider provider) {}



//  /**
//  *
//  * @return get the set of all the products offered/sold by this business
//  */
//  public Set<Product> getProductCatalog() {}
 

 
//  /**
//  * @return get the set of all the Services offered/sold by this business
//  */
//  public Set<Service> getOfferedServices() {}



//  /**
//  * Discontinue Item, i.e. stop selling a Service or Product.
//  * Also prevent the Item from being added in the future.
//  * If it's a Service - remove it from the set of provided services.
//  * If it's a Product - still sell whatever instances of this Product are in stock, but do not
// restock it.
//  * @param item the item to discontinue see {@link Item}
//  */
//  protected void discontinueItem(Item item) {}
 

//  /**
//  * Set the default product stock level for the given product
//  * @param prod
//  * @param level
//  */
//  protected void setDefaultProductStockLevel(Product prod, int level) {}




}
