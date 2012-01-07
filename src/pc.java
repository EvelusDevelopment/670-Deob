
final class pc {

   static cga d;
   static int e;
   static int b;
   static long[] f = new long[11];
   static int c;
   static long[][] g = new long[8][256];
   static Object[] a;


   static final void a(int var0) {
      ov.b = new String[500];
      ++e;
      gra.e = 2 + ((int[])((int[])pia.d[1]))[2] + ((int[])((int[])pia.d[1]))[0];
      cl.e = 2 + ((int[])((int[])nsa.c[1]))[0] + ((int[])((int[])nsa.c[1]))[2];
      if(var0 > -83) {
         ((int[])((int[])a[4]))[1] = -17;
      }

      for(int var1 = 0; ~var1 > ~ov.b.length; ++var1) {
         ov.b[var1] = "";
      }

      qs.a((byte)114, gj.a(dp.y, -119, gj.w));
   }

   static final Object[] a(Object[] var0, int var1, Object[] var2, Object[] var3) {
      var3[1] = var0;
      var3[0] = var2;
      ++c;
      if(var1 >= -97) {
         a((Object[])null, ((int[])((int[])var2[18]))[14], (Object[])((Object[])var2[8]), (Object[])null);
      }

      return var3;
   }

   static final re a(byte var0, Object[] var1) {
      ++b;
      if(null != var1 && -6 == ~var1.length) {
         return (re)var1[4];
      } else if(var1 != null && -4 == ~var1.length) {
         return (re)var1[2];
      } else {
         int var2 = -104 / ((var0 - 7) / 47);
         return null != var1 && 4 == var1.length?(re)var1[3]:null;
      }
   }

   static {
      int var0;
      for(var0 = 0; 256 > var0; ++var0) {
         char var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦?䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬?贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀?﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓?鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
         long var2 = (1 & var0) == 0?(long)(var1 >>> 8):(long)(var1 & 255);
         long var4 = var2 << 1;
         if(-257L >= ~var4) {
            var4 ^= 285L;
         }

         long var6 = var4 << 1;
         if(var6 >= 256L) {
            var6 ^= 285L;
         }

         long var8 = var6 ^ var2;
         long var10 = var6 << 1;
         if(-257L >= ~var10) {
            var10 ^= 285L;
         }

         long var12 = var2 ^ var10;
         g[0][var0] = var4 << 8 | var10 << 24 | var2 << 48 | var2 << 56 | var6 << 40 | var2 << 32 | var8 << 16 | var12;

         for(int var14 = 1; 8 > var14; ++var14) {
            g[var14][var0] = g[-1 + var14][var0] << 56 | g[var14 - 1][var0] >>> 8;
         }
      }

      f[0] = 0L;

      for(var0 = 1; var0 <= 10; ++var0) {
         int var15 = var0 * 8 - 8;
         f[var0] = 65280L & g[6][6 + var15] ^ 280375465082880L & g[2][var15 + 2] ^ 71776119061217280L & g[1][1 + var15] ^ g[0][var15] & -72057594037927936L ^ g[3][var15 + 3] & 1095216660480L ^ 4278190080L & g[4][var15 + 4] ^ 16711680L & g[5][var15 + 5] ^ 255L & g[7][7 + var15];
      }

      a = sd.a(new Object[1], 110, (byte)120);
   }
}
