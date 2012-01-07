import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggSyncState;

final class ur {

   static int d;
   static int c;
   static Object[] e = sd.a(new Object[1], 86, (byte)117);
   static int b;
   static int f;
   static int a;
   static int h;
   static int g;


   static final int a(int var0, int var1, int var2, int var3) {
      ++b;
      if(dp.q < 100) {
         return -2;
      } else {
         int var6 = -2;
         int var7 = Integer.MAX_VALUE;
         int var8 = var0 - eka.n;
         int var9 = -eka.u + var1;
         rda var4;
         Object[] var10 = (var4 = (rda)dda.a(eka.t, 2)) != null?var4.o:null;
         if(var3 != 32132) {
            a(13, false);
         }

         rda var5;
         for(; var10 != null; var10 = (var5 = (rda)client.a(eka.t, -28280)) != null?var5.o:null) {
            if(((int[])((int[])var10[1]))[3] == var2) {
               int var11 = ((int[])((int[])var10[1]))[0];
               int var12 = ((int[])((int[])var10[1]))[4];
               int var13 = var11 + eka.n << 14 | var12 + eka.u;
               int var14 = (var8 - var11) * (var8 - var11) + (var9 - var12) * (-var12 + var9);
               if(0 > var6 || var14 < var7) {
                  var7 = var14;
                  var6 = var13;
               }
            }
         }

         return var6;
      }
   }

   static final Object[] a(int var0, Object[] var1, Object[] var2, boolean var3, int var4) {
      try {
         if(var3) {
            f = 16;
         }

         am.a(var2, (byte)125);
         ++c;
         if(var2[7] == null) {
            var2[7] = new boolean[4];
         }

         if(!hp.a((byte)-126, "jagtheora")) {
            throw new RuntimeException("Failed to load jagtheora library");
         } else {
            var2[9] = new byte[var0];
            var2[2] = new OggSyncState();
            var2[1] = new OggPage();
            var2[0] = new OggPacket();
            var2[4] = nb.a((byte)64, 8, new Object[5]);
            vu.a(var2, -28785);
            var2[14] = var1;
            ((int[])((int[])var2[12]))[1] = var4;
            return var2;
         }
      } catch (RuntimeException var6) {
         throw vt.a(var6, "ur.B(" + var0 + ',' + (var1 != null?"{...}":"null") + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ',' + var4 + ')');
      }
   }

   static final void a(int var0, Object[] var1, int var2, Object[] var3) {
      if(var0 == 1) {
         ((char[])((char[])var1[0]))[0] = kf.a(true, ipa.a(var3, (int)-90));
      }

      ++h;
      if(var2 != 0) {
         a((Object[])null, ((byte[])((byte[])e[7]))[1]);
      }

   }

   static final int a(Object[] var0, byte var1) {
      ++a;
      int var2 = 80 % ((49 - var1) / 61);
      return 0;
   }

   static final void a(Object[] var0, float var1, float var2, boolean var3) {
      ((float[])((float[])var0[0]))[12] = var2;
      if(var3) {
         a(-11, (Object[])null, ((int[])((int[])var0[4]))[8], (Object[])null);
      }

      ++d;
      ((float[])((float[])var0[0]))[5] = var1;
      loa.b((byte)-106, var0);
   }

   static final void a(int var0, boolean var1) {
      ++g;
      if(fh.a(var0, 25401, (int[])null)) {
         ju.a(-1, 108, (Object[][])((Object[][])hca.f[var0][2]));
         if(!var1) {
            ((byte[])((byte[])e[2]))[7] = -75;
         }

      }
   }

}
