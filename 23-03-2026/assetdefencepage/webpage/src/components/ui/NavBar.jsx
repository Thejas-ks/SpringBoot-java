function NavBar() {
  return (
    <div className=" bg-black flex justify-between items-center pt-4 p-5 gap-5 w-full text-0xl ">
      <div>
        <div className="text-white text-4xl" ><h2>🎯</h2></div>
      </div>

      <div className="flex justify-between gap-5 border rounded-full px-2.5 py-2.5 pt-1 text-white ">
        <div>Home</div>
        <div>DeFi App</div>
        <div>Assets</div>
        <div>Features</div>
        <div>Pricing</div>
        <div>FAQ</div>
        <div className=" gap-6">Protection↙️</div>
      </div>

      <div>
        <div className=" border rounded-md px-1 py-1 text-white ">
            🤵Create Account
        </div>
      </div>
    </div>
  );
}
export default NavBar;