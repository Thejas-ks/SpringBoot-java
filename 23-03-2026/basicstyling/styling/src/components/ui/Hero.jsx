function Hero(){

    const handleRefresh=()=>{
        window.location.href="https://tailwindcss.com/";
    }
    return(
        <section className=" flex w-full justify-center items-center h-75 bg-white">
            <div className=" text-center flex flex-col items-center">
                <div className="text-6xl pb-5 bg-white">Prosperity of Knowledge</div>
                <div className=" text-2xl pb-5">JCBM College, Sringeri </div>
                <div>
  <button
    className="
      text-xl font-semibold
      px-6 py-3
      bg-red-500 text-white
      rounded-lg
      shadow-md
      transition-all duration-300
      hover:bg-green-
      hover:scale-105
      hover:shadow-lg
      active:scale-95
    "
    onClick={handleRefresh}
  >
    Explore
  </button>
</div>
            </div>
        </section>
    );
}
export default Hero;