import jagdx.D3DLIGHT;

final class eqa {

   static int b = 0;
   static int a;
   static int c;


   static final void a(byte var0, Object[] var1) {
      if(((boolean[])((boolean[])var1[63]))[16]) {
         float var2 = !((boolean[])((boolean[])var1[63]))[0]?0.0F:((float[])((float[])var1[0]))[8];
         float var3 = !((boolean[])((boolean[])var1[63]))[0]?0.0F:-((float[])((float[])var1[0]))[0];
         D3DLIGHT.SetDiffuse(((long[])((long[])var1[50]))[3], ((float[])((float[])var1[0]))[11] * var2, var2 * ((float[])((float[])var1[0]))[2], ((float[])((float[])var1[0]))[3] * var2, 0.0F);
         D3DLIGHT.SetDiffuse(((long[])((long[])var1[50]))[2], ((float[])((float[])var1[0]))[11] * var3, var3 * ((float[])((float[])var1[0]))[2], var3 * ((float[])((float[])var1[0]))[3], 0.0F);
         ((boolean[])((boolean[])var1[63]))[21] = false;
      }

      ++a;
      if(var0 > -36) {
         a((byte)-106);
      }

   }

   static final void a(byte var0) {
      ++c;
      ih.a(tu.d, (Object[])((Object[])tu.d[2]), 1, -98);
      ih.a(tu.d, (Object[])((Object[])tu.d[14]), 1, -116);
      ih.a(tu.d, (Object[])((Object[])tu.d[11]), 1, -47);
      ih.a(tu.d, (Object[])((Object[])tu.d[7]), 1, -54);
      ih.a(tu.d, (Object[])((Object[])tu.d[36]), 1, -100);
      ih.a(tu.d, (Object[])((Object[])tu.d[3]), 1, -34);
      ih.a(tu.d, (Object[])((Object[])tu.d[29]), 0, -63);
      ih.a(tu.d, (Object[])((Object[])tu.d[41]), 0, -111);
      ih.a(tu.d, (Object[])((Object[])tu.d[10]), 0, -91);
      ih.a(tu.d, (Object[])((Object[])tu.d[13]), 0, -83);
      ih.a(tu.d, (Object[])((Object[])tu.d[24]), 0, -55);
      ih.a(tu.d, (Object[])((Object[])tu.d[6]), 0, -92);
      ih.a(tu.d, (Object[])((Object[])tu.d[25]), 0, -105);
      ih.a(tu.d, (Object[])((Object[])tu.d[38]), 0, -72);
      ih.a(tu.d, (Object[])((Object[])tu.d[16]), 0, -105);
      if(var0 >= -122) {
         b = -106;
      }

      ih.a(tu.d, (Object[])((Object[])tu.d[37]), 0, -60);
      ih.a(tu.d, (Object[])((Object[])tu.d[17]), 0, -122);
      ih.a(tu.d, (Object[])((Object[])tu.d[19]), 0, -70);
      ih.a(tu.d, (Object[])((Object[])tu.d[9]), 0, -115);
      ih.a(tu.d, (Object[])((Object[])tu.d[1]), 0, -43);
      fd.a(91);
      ih.a(tu.d, (Object[])((Object[])tu.d[4]), 2, -121);
      ih.a(tu.d, (Object[])((Object[])tu.d[20]), 2, -89);
      iea.a((byte)39);
      tea.a((byte)-120);
      jea.c = true;
   }

}
