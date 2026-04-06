import { useState } from "react";
import AboutUs from "./AboutUs";

function Navbar() {

  const [showAbout, setShowAbout] = useState(false);

  const handleRefresh = () => {
    window.location.reload();
  };

  const loadPage = () => {
    window.location.href = "https://www.youtube.com";
  };

  const click = () => {
    setShowAbout(true);
  };

  return (
    <>
      <div className="flex justify-between px-5 py-5 bg-red-400">

        <div className="flex gap-2.5">
          <button onClick={handleRefresh}>Logo</button>
          <div>JCBM College</div>
        </div>

        <div className="flex gap-3">
          <button onClick={loadPage}>Home</button>
          <button onClick={click}>About Us</button>
          <div>Services</div>
          <div>Products</div>
          <div>Contact Us</div>
        </div>

        <div className="flex gap-2.5">
          <button>Sign Up</button>
          <div>Login</div>
        </div>
      </div>

      {/* 👇 This is where it actually renders */}
      {showAbout && <AboutUs />}
    </>
  );
}

export default Navbar;